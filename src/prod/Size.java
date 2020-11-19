package prod;

/**
 * @author yuriismac on 2020-11-17.
 * @project lesson3_Generics
 */
public enum Size {

    XXS(32) {
        @Override
        public String getDescription() {
            return "I'm XXS size";
        }
    },
    XS(34) {
        @Override
        public String getDescription() {
            return"I'm XS size";
        }
    },
    S(36) {
        @Override
        public String getDescription() {
            return "I'm S size";
        }
    },
    M(38) {
        @Override
        public String getDescription() {
            return "I'm M size";
        }
    },
    L(40) {
        @Override
        public String getDescription() {
            return "I'm L size";
        }
    };

    private int euroSize;

    Size(int euroSize) {
        this.euroSize = euroSize;
    }

    public int getEuroSize() {
        return euroSize;
    }

    public abstract String getDescription();

}