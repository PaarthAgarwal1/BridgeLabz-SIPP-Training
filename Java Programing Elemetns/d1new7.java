class d1_programingElement {
    public static void main(String args[]) {
        int earthRadiusKm = 6378;
        double earthRadiusMiles = earthRadiusKm * 0.621371;

        double volumeKm = (4.0 / 3) * Math.PI * Math.pow(earthRadiusKm, 3);
        double volumeMiles = (4.0 / 3) * Math.PI * Math.pow(earthRadiusMiles, 3);

        System.out.println("The volume of Earth in cubic kilometers is " + volumeKm + 
                           " and in cubic miles is " + volumeMiles);
    }
}
