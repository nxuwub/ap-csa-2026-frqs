public Account(String requestedName) {
    if (isAvailable(requestedName)) {
        username = requestedName;
    } else {
        int n = 1;
        String attempt = requestedName + n;

        while (isAvailable(attempt) == false) {
            n = n + 1; 
            attempt = requestedName + n;
        }

        username = attempt
    }
}
