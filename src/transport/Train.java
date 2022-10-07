package transport;

public class Train extends Transport {
    private Integer trippCost;
    private double trippDuration;
    private String departureStationName;
    private String arrivalStationName;
    private Integer wagonsAmount;

    public Train(String brand,
                 String model,
                 int productionYear,
                 Integer maxSpeed,
                 String productionCountry,
                 String color,
                 Integer trippCost,
                 double trippDuration,
                 String departureStationName,
                 String arrivalStationName,
                 Integer wagonsAmount) {
        super(brand,model,productionYear, productionCountry,color,maxSpeed);

        setTrippCost(trippCost);
        setTrippDuration(trippDuration);
        setDepartureStationName(departureStationName);
        setArrivalStationName(arrivalStationName);
        setWagonsAmount(wagonsAmount);
    }

    public void printTrain() {
        System.out.printf("Поезд %s, модель %s, %d года выпуска в %s, скорость передвижения - %d км/ч,\n" +
                        "отходит от %s и следует до станции %s. Цена поездки - %d рублей, в поезде\n" +
                        " %d вагонов.\n", getBrand(), getModel(), getProductionYear(), getProductionCountry(),
                getMaxSpeed(), getDepartureStationName(), getArrivalStationName(), getTrippCost(), getWagonsAmount());
    }

    public Integer getTrippCost() {
        return trippCost;
    }

    public void setTrippCost(Integer trippCost) {
        if (trippCost!=null && trippCost>=0) {
            this.trippCost = trippCost;
        } else {
            this.trippCost = 0;
        }
    }

    public double getTrippDuration() {
        return trippDuration;
    }

    public void setTrippDuration(double trippDuration) {
        if (trippDuration>0) {
            this.trippDuration = trippDuration;
        } else {
            this.trippDuration = 0;
        }
    }

    public String getDepartureStationName() {
        return departureStationName;
    }

    public void setDepartureStationName(String departureStationName) {
        if (departureStationName !=null && !departureStationName.isBlank()) {
            this.departureStationName = departureStationName;
        } else {
            this.departureStationName = "Введите название станции отправления!";
        }
    }

    public String getArrivalStationName() {
        return arrivalStationName;
    }

    public void setArrivalStationName(String arrivalStationName) {
        if (arrivalStationName !=null && !arrivalStationName.isBlank()) {
            this.arrivalStationName = arrivalStationName;
        } else {
            this.arrivalStationName = "Введите название станции прибытия!";
        }
    }

    public Integer getWagonsAmount() {
        return wagonsAmount;
    }

    public void setWagonsAmount(Integer wagonsAmount) {
        if (wagonsAmount>0) {
            this.wagonsAmount = wagonsAmount;
        } else {
            this.wagonsAmount = 0;
        }
    }
}
