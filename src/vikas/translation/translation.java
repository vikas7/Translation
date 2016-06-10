package vikas.translation;
import com.memetix.mst.language.Language;
import com.memetix.mst.translate.*;

public class translation {
	public static void main(String[] args) throws Exception{
		//BufferedReader br=new BufferedRedaer(new InputStreamReader(System.in))
		
		System.out.println(findTransalated("name"));
//		Translate.setClientId("Vikas_translation");
//		Translate.setClientSecret("us2d362oaVG3oXuRGay/zKNINbTr43bmq4Jz3S9uqeg=");
//		String translatedText=Translate.execute("my name is deepak", Language.ENGLISH, Language.HINDI);
//		System.out.println(translatedText);
		
	}
	public static String findTransalated(String str)throws Exception{
		Translate.setClientId("Vikas_translation");
		Translate.setClientSecret("us2d362oaVG3oXuRGay/zKNINbTr43bmq4Jz3S9uqeg=");
		String translatedText=Translate.execute(str, Language.ENGLISH, Language.HINDI);
		return translatedText;
		//.out.println(translatedText);
		
	}

}
