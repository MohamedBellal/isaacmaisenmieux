class Task {
    private String name;
    private int size;
    private double cpuUsage;
    private double gpuUsage;

    private double ramUsage;

    public Task(String name, int size, double cpuUsage, double gpuUsage, double ramUsage) {
        this.name = name;
        this.size = size;
        this.cpuUsage = cpuUsage;
        this.gpuUsage = gpuUsage;
        this.ramUsage = ramUsage;
    }

    public String getname() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getSize() {
        return size;
    }

    public void seSize(int Size) {
        this.size = size;
    }

    public double getCpuUsage() {
        return cpuUsage;
    }

    public void setCpuUsage() {
        this.cpuUsage = cpuUsage;
    }

    public double getGpuUsage() {
        return cpuUsage;
    }

    public void setGpuUsage() {
        this.gpuUsage = gpuUsage;
    }


    public double getRamUsage() {
        return ramUsage;
    }

    public void setRamUsage() {
        this.ramUsage = ramUsage;
    }

    @Override
    public String toString() {
        return "----------\n" + name + ":\n" +
                "Storage usage: " + size + " Go\n" +
                "CPU usage: " + cpuUsage + " %\n" +
                "GPU usage: " + gpuUsage + " %\n" +
                "RAM usage: " + ramUsage + " %\n" +
                "----------";
    }
}