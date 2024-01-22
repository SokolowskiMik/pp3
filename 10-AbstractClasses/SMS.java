
    public class SMS extends Message {
        private String phoneNumber;  // Attribute to store the phone number
    
        // Constructor to initialize the phone number
        public SMS(String text, String phoneNumber) {
            super(text);
            this.phoneNumber = phoneNumber;
        }
    
        // Accessor method to get the phone number
        public String getPhoneNumber() {
            return phoneNumber;
        }
    
        // Mutator method to set the phone number
        public void setPhoneNumber(String phoneNumber) {
            this.phoneNumber = phoneNumber;
        }
    
        // Override the send() method to display SMS details
        @Override
        public void send() {
            System.out.println("Sending SMS to " + phoneNumber);
            System.out.println("Message: " + getText());
            System.out.println("Number of characters: " + charNumber());
        }
    
        // Additional method specific to SMS class, if needed
        public void additionalMethod() {
            // Implement specific functionality for SMS class
        }
    }

