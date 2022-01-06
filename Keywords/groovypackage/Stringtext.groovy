package groovypackage

import com.kms.katalon.core.annotation.Keyword













public class Stringtext {

	@Keyword
	def static  planetext(String text) {

		String text1 = text.substring(0, 2);
		String   text2 = text.substring(2, 4);
		String  text3 = text.substring(4, 8);

		String textmain1= ''+text1+'/'+text2+'/'+text3+''
		return textmain1
	}
}
