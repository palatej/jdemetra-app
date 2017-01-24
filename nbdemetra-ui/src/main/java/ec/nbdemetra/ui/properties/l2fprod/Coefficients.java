/*
 * Copyright 2017 National Bank of Belgium
 *
 * Licensed under the EUPL, Version 1.1 or – as soon they will be approved 
 * by the European Commission - subsequent versions of the EUPL (the "Licence");
 * You may not use this work except in compliance with the Licence.
 * You may obtain a copy of the Licence at:
 * 
 * http://ec.europa.eu/idabc/eupl
 * 
 * Unless required by applicable law or agreed to in writing, software 
 * distributed under the Licence is distributed on an "AS IS" basis,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the Licence for the specific language governing permissions and 
 * limitations under the Licence.
 */
package ec.nbdemetra.ui.properties.l2fprod;

import java.util.LinkedHashMap;
import java.util.Map;

/**
 *
 * @author Mats Maggi
 */
public class Coefficients {

    private Map<String, double[]> fixedCoefficients;
    private String[] AllNames;

    public Coefficients() {
        fixedCoefficients = new LinkedHashMap<>();
    }

    public Coefficients(Map<String, double[]> fixed) {
        this.fixedCoefficients = new LinkedHashMap<>(fixed);
    }

    public void setAllNames(String[] AllNames) {
        this.AllNames = AllNames;
    }

    public String[] getAllNames() {
        return AllNames;
    }

    public Map<String, double[]> getFixedCoefficients() {
        return fixedCoefficients;
    }

    public void setFixedCoefficients(Map<String, double[]> fixedCoefficients) {
        this.fixedCoefficients = new LinkedHashMap<>(fixedCoefficients);
    }
}
