// package com.lxisoft.config;
// import java.util.Locale;  
// import java.util.ResourceBundle;  
// public class Internationalization
// {  
// 	public void in()
// 	{  
//   		ResourceBundle bundle =ResourceBundle.getBundle("Message", Locale.US);  
//   		System.out.println(bundle.getString("submit")); 	
//  	} 
// }  

package com.lxisoft.config;
import java.util.Locale;
import java.util.ResourceBundle;
public class Localizer {
    private final static String RESOURCE_BUNDLE = "com.lxisoft.localization.Message";
    private Locale locale = null;
    public Localizer() { this(Locale.getDefault()); }
    public Localizer(Locale locale) { this.locale = locale; }
    public String getLocalizedText(String key)
    {
        try
        {
            ResourceBundle bundle = ResourceBundle.getBundle(RESOURCE_BUNDLE,
                    locale, this.getClass().getClassLoader());
    
            if (bundle.keySet().contains(key)) 
            {
                return bundle.getString(key);
            }
            else
            {
                return key + "(No localization entry found)";
            }
        }
        catch (Exception e)
        {
            return "LOCALIZATION FAILED: " + e.toString();
        }
    }
}