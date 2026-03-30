package edu.kis.vh.nursery;

public class HanoiRhymer extends defaultCountingOutRhymer {

    private int totalRejected = 0;

    public int reportRejected() {
        return getTotalRejected();
    }

    public void countIn(int in) {
        if (!callCheck() && in > peekaboo())
            setTotalRejected(getTotalRejected() + 1);
        else
            super.countIn(in);
    }

	private int getTotalRejected() {
		return totalRejected;
	}

	private void setTotalRejected(int totalRejected) {
		this.totalRejected = totalRejected;
	}
}