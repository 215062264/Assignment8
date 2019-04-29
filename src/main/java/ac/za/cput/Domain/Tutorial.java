package ac.za.cput.Domain;

public class Tutorial {

    private String tutorId, tutorFirstName, tutorLastName;

    private Tutorial(){}

    private Tutorial(Tutorial.Builder builder) {
        this.tutorId = builder.tutorId;
        this.tutorFirstName = builder.tutorFirstName;
        this.tutorLastName = builder.tutorLastName;
    }

    public String getTutorId() {
        return tutorId;
    }

    public String getTutorFirstName() {
        return tutorFirstName;
    }

    public String getTutorLastName() {
        return tutorLastName;
    }


    public static class Builder {

        private String tutorId, tutorFirstName, tutorLastName;

        public Tutorial.Builder tutorId(String tutorId) {
            this.tutorId = tutorId;
            return this;
        }

        public Tutorial.Builder tutorFirstName(String tutorFirstName) {
            this.tutorFirstName = tutorFirstName;
            return this;
        }

        public Tutorial.Builder tutorLastName(String tutorLastName) {
            this.tutorLastName = tutorLastName;
            return this;
        }



        public Tutorial build() {
            return new Tutorial(this);
        }

    }

    @Override
    public String toString() {
        return "Tutorial{" +
                "tutorId='" + tutorId + '\'' +
                ", Tutor First Name='" + tutorFirstName + '\'' +
                ", Tutor Last Name='" + tutorLastName + '\'' +
                '}';
    }

}
