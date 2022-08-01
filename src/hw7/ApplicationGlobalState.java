package hw7;

public final class ApplicationGlobalState {
    private static ApplicationGlobalState INSTANCE;
    private String selectedCity = null;
    private final String API_KEY = "f3f18f52a3bf39a12040d146f377a4a3";


    private ApplicationGlobalState() {
    }

    // Непотокобезопасный код для упрощения
    public static ApplicationGlobalState getInstance() {
        if(INSTANCE == null) {
            INSTANCE = new ApplicationGlobalState();
        }

        return INSTANCE;
    }


    public String getSelectedCity() {
        return selectedCity;
    }

    public void setSelectedCity(String selectedCity) {
        this.selectedCity = selectedCity;
    }

    public String getApiKey() {
        return this.API_KEY;
    }
}

