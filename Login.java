public boolean login(String username, String password) {
    User user = users.get(username);
    if (user != null && user.getPassword().equals(password)) {
        return true;
    }
    return false;
}
