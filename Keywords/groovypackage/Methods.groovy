package groovypackage

import com.kms.katalon.core.annotation.Keyword
import com.kms.katalon.core.util.KeywordUtil

public class Methods {

	@Keyword
	def static verifyDownloadedfile(String downloadPath, String fileextention) {

		File dir = new File(downloadPath);
		File[] dirContents = dir.listFiles();
		String lastAttempt = '';
		if (dirContents.length > 0) {
			for (int i = 0; i < dirContents.length; i++) {
				if (dirContents[i].getName().contains(fileextention)) {

					// File has been found, it can now be deleted:
					dirContents[i].delete();
					KeywordUtil.markPassed(fileextention + ' exist in ' + downloadPath + ' and was deleted')
					return true;
				}
				//	lastAttempt = dirContents[i].getName().equals(fileName);
			}
			if (lastAttempt != fileextention) {
				KeywordUtil.markFailed(fileextention + ' does not exist in ' + downloadPath)
				return false;
			}
		}
		KeywordUtil.markFailed(fileextention + ' does not exist in ' + downloadPath)
		return false;
	}
}
