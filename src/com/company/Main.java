package com.company;

import java.util.*;
interface MonitoringSystem
{
    public void startMonitoring();
}

public class Main
{
    public static void main(String[] args)
    {
        // Не правильно!
        /*GeneralIndicatorsMonitoringModule generalIndicatorsMonitoringModule = new GeneralIndicatorsMonitoringModule();
        ErrorsMonitoringModule errorsMonitoringModule = new ErrorsMonitoringModule();
        SecurityMonitoringModule securityMonitoringModule  = new SecurityMonitoringModule();

        generalIndicatorsMonitoringModule.startMonitoring();
        errorsMonitoringModule.startMonitoring();
        securityMonitoringModule.startMonitoring();*/


        MonitoringSystem generanSystem = new MonitoringSystem()
        {
            @Override
            public void startMonitoring()
            {
                System.out.println("Мониторинг общих показателей");
            }
        };
        MonitoringSystem errorsSystem = new MonitoringSystem()
        {
            @Override
            public void startMonitoring()
            {
                System.out.println("Мониторинг ошибок показателей");
            }
        };
        MonitoringSystem securitySystem = new MonitoringSystem()
        {
            @Override
            public void startMonitoring()
            {
                System.out.println("Мониторинг безопастности показателей");
            }
        };
        generanSystem.startMonitoring();
        errorsSystem.startMonitoring();
        securitySystem.startMonitoring();
    }

}
/*interface MonitoringSystem
{
    public void startMonitoring();
}
class GeneralIndicatorsMonitoringModule implements MonitoringSystem
{
    @Override
    public void startMonitoring()
    {
        System.out.println("Мониторинг общих показателей");
    }
}
class ErrorsMonitoringModule implements MonitoringSystem
{

    @Override
    public void startMonitoring()
    {
        System.out.println("Мониторинг ощибок показателей");
    }
}
class SecurityMonitoringModule implements MonitoringSystem
{
    @Override
    public void startMonitoring()
    {
        System.out.println("Мониторинг безопастности показателей");
    }
}*/