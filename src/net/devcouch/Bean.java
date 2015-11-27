package net.devcouch;

public class Bean {
    public final String firstName;
    public final String lastName;

    private Bean(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
    }

    public String toString() {
        return firstName + " " + lastName;
    }

    public static class Builder {
        private String firstName;
        private String lastName;

        public Builder firstName(String firstName) {
            this.firstName = firstName;
            return this;
        }

        public Builder lastName(String lastName) {
            this.lastName = lastName;
            return this;
        }

        public Bean build() {
            return new Bean(firstName, lastName);
        }
    }
}
