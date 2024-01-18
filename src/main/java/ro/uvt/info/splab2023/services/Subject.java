package ro.uvt.info.splab2023.services;

public interface Subject {
    void attach(Observer o);
    void detach(Observer o);
    void notifyObservers(Object arg);
}