package com.sr.solid.isp;

public interface Remotable {
        void powerOn();
        void powerOff();
        void volumeUp();
        void volumeDown();
        void changeChannel(int channel);
        void setTemperature(int temperature);
}

