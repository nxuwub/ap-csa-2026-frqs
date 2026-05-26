public String getShortenedName() {
    String result = "";

    for (int i = 0; i < username.length(); i++) {
        char ch = username.charAt(i);

        if (ch == '-') {
            if (result.length() > 0) {
                result = result.substring(0, result.length() - 1);
            }
        } else {
            result = result + ch
        }
    }

    return result;
}
