package com.mdxco.coupling.loose;

public class WebServiceDataProvider implements UserDataProvider {

    @Override
    public String getUserDetails() {
        return "Fetching Data From WebService";
    }
}
