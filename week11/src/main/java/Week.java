public enum Week {
    MONDAY {
        @Override
        void sayHello() {
            System.out.println("Hello, Monday");
        }
    },
    TUESDAY {
        @Override
        void sayHello() {
            System.out.println("Hello, Tuesday");
        }
    },
    WEDNESDAY {
        @Override
        void sayHello() {
            System.out.println("Hello, Wednesday");
        }
    },
    THURSDAY {
        @Override
        void sayHello() {
            System.out.println("Hello, Thursday");
        }
    },
    FRIDAY {
        @Override
        void sayHello() {
            System.out.println("Hello, Friday");
        }
    },
    SATURDAY {
        @Override
        void sayHello() {
            System.out.println("Hello, Saturday");
        }
    },
    SUNDAY {
        @Override
        void sayHello() {
            System.out.println("Hello, Sunday");
        }
    };

    abstract void sayHello();
}
