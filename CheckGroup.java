package RegisterReseller;

import org.openqa.selenium.WebDriver;

public class CheckGroup {
	// check domain space group on TAB ( Global Domain, Australian Domains, Country Code Domains, Sponsored Domains, New Domains)
	public String domainspace(String domain){
		if ( domain.endsWith(".com") || domain.endsWith(".biz") || domain.endsWith(".net") || domain.endsWith(".info") ||
				domain.endsWith(".mobi") || domain.endsWith(".org")){
			return "global";
		}else if ( domain.endsWith(".com.au") || domain.endsWith(".net.au") || domain.endsWith(".org.au") || domain.endsWith(".id.au") ||
					domain.endsWith(".id.au")){
			return "au";
		}else if ( domain.endsWith(".nz") || domain.endsWith("tv") || domain.endsWith(".in") || domain.endsWith(".jp") ||domain.endsWith(".uk")||
				domain.endsWith(".id.au")||domain.endsWith(".us")||domain.endsWith(".hk")||domain.endsWith(".tw")||domain.endsWith(".co")||domain.endsWith(".fr")){
			return "country";
		}else if ( domain.endsWith("eu") || domain.endsWith("mobi") || domain.endsWith("asia") || domain.endsWith("travel")){
			return "sponsored";
		}else{
			return "new";
		}
	}
	// check year com/net can select 1-10 years, others like com.au default 2 years, uk 2 years
	public boolean checkyear(String domain){
		if ( domain.endsWith(".com") || domain.endsWith(".net") ||domain.endsWith(".biz") || domain.endsWith(".travel") || domain.endsWith(".info") ||
				domain.endsWith(".mobi") || domain.endsWith(".org") || domain.endsWith(".us") || domain.endsWith(".tv") || domain.endsWith(".ca")||
				domain.endsWith(".co") || domain.endsWith(".nz") || domain.endsWith(".in") || domain.endsWith(".hk") || domain.endsWith(".tw")||
				domain.endsWith(".cc") || domain.endsWith(".asia")){
			return true;
		}else{
			return false;
		}
	}
}
