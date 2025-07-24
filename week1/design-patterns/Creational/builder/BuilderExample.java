class User {
    private final String firstName;
    private final String lastName;

    public static class Builder {
        private String firstName;
        private String lastName;

        public Builder setFirstName(String firstName) {
            this.firstName = firstName;
            return this;
        }

        public Builder setLastName(String lastName) {
            this.lastName = lastName;
            return this;
        }

        public User build() {
            return new User(this);
        }
    }

    private User(Builder builder) {
        this.firstName = builder.firstName;
        this.lastName = builder.lastName;
    }

    public String getFullName() {
        return firstName + " " + lastName;
    }
}