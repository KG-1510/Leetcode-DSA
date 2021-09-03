public class Codec {

    // Encodes a URL to a shortened URL.
    public String encode(String longUrl) {
        String encoded = "";
        for(int i=0; i<longUrl.length(); i++) {
            int ch = longUrl.charAt(i) + 1;
            encoded += (char)ch;
        }
        return encoded;
    }

    // Decodes a shortened URL to its original URL.
    public String decode(String shortUrl) {
        String decoded = "";
        for(int i=0; i<shortUrl.length(); i++) {
            int ch = shortUrl.charAt(i) - 1;
            decoded += (char)ch;
        }
        return decoded;
    }
}

// Your Codec object will be instantiated and called as such:
// Codec codec = new Codec();
// codec.decode(codec.encode(url));