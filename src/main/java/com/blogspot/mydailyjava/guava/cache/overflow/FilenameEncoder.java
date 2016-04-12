package com.blogspot.mydailyjava.guava.cache.overflow;

public class FilenameEncoder {

    public static String encode(String s) {
        try
        {
            return java.net.URLEncoder.encode(s, "UTF-8");
        }
        catch (java.io.UnsupportedEncodingException e)
        {
            throw new RuntimeException("UTF-8 is an unknown encoding!?");
        }
    	/*
    	char fileSep = File.separatorChar; // ... or do this portably.
    	char escape = '%'; // ... or some other legal char.
    	int len = s.length();
    	StringBuilder sb = new StringBuilder(len);
    	for (int i = 0; i < len; i++) {
    	    char ch = s.charAt(i);
    	    if (isIllegalFilenameChar(ch) 
    	        || (ch == '.' && i == 0) // we don't want to collide with "." or ".."!
    	        || ch == escape) {
    	        sb.append(escape);
    	        if (ch < 0x10) {
    	            sb.append('0');
    	        }
    	        sb.append(Integer.toHexString(ch));
    	    } else {
    	        sb.append(ch);
    	    }
    	} 
    	return sb.toString();*/
    }
    
    public static String decode(String s) {
    	try {
    		return java.net.URLDecoder.decode(s, "UTF-8");
    	} catch (java.io.UnsupportedEncodingException e) {
    		throw new RuntimeException("UTF-8 is an unknown encoding!?");
    	}
    	/*
    	char escape = '%'; // ... or some other legal char.
    	int len = s.length();
    	StringBuilder sb = new StringBuilder(len);
    	for (int i = 0; i < len; i++) {
    		char ch = s.charAt(i);
    		if ()
    	}*/
    }
    
    private boolean isIllegalFilenameChar(char ch) {
    	/* TODO: make this platform independend: i.e. in UNIX only '\' is illegal, 
    	 * in windows: https://msdn.microsoft.com/en-us/library/windows/desktop/aa365247(v=vs.85).aspx#file_and_directory_names gives an overview
    	 *  
    	 */
    	return ch == ':'; 
    }
	
}
