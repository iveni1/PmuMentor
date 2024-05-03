public void updateProfile(String username, String newEmail) {
    User user = users.get(username);
    if (user != null) {
        user.setEmail(newEmail);
    }
}
