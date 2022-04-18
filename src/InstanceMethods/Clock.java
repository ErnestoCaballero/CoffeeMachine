package InstanceMethods;

class Clock {
    int hours = 12;
    int minutes = 58;

    void next() {
       if (++this.minutes > 59) {
            this.hours = this.hours == 12 ? 1 : this.hours + 1;
            this.minutes = 0;
        }
    }

}
