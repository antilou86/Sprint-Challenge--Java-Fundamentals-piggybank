package piggy-bank;

    public static class Main {
        public static void main(String[] args) {
            //most of the computations are spread out amongst the PiggyBank class and individual coin classes

            //creates the PiggyBank collection.
            PiggyBank piggyBank=new PiggyBank();

            piggyBank.add(new Quarter());
            piggyBank.add(new Dime());
            piggyBank.add(new Dollar(5));
            piggyBank.add(new Nickel(3));
            piggyBank.add(new Dime(7));
            piggyBank.add(new Dollar());
            piggyBank.add(new Penny(10));

            //gets total
            piggyBank.print();

            //tests removal
            System.out.println("\n*** Removal ***");
            piggyBank.remove(1.50);
        }
    }
        }
    }