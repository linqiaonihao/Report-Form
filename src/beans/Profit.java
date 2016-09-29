package beans;

public class Profit {
	private String goodsName;
	private int goodsId;
	private int costPrice;
	private int sellingPrice;
	private int tradingNum;
	private int times;
	private int profit;

	@Override
	public String toString() {
		return "Profit [goodsName=" + goodsName + ", goodsId=" + goodsId + ", costPrice=" + costPrice
				+ ", sellingPrice=" + sellingPrice + ", tradingNum=" + tradingNum + ", times=" + times + ", profit="
				+ profit + "]";
	}

	public String getGoodsName() {
		return goodsName;
	}

	public void setGoodsName(String goodsName) {
		this.goodsName = goodsName;
	}

	public int getGoodsId() {
		return goodsId;
	}

	public void setGoodsId(int goodsId) {
		this.goodsId = goodsId;
	}

	public int getCostPrice() {
		return costPrice;
	}

	public void setCostPrice(int costPrice) {
		this.costPrice = costPrice;
	}

	public int getSellingPrice() {
		return sellingPrice;
	}

	public void setSellingPrice(int sellingPrice) {
		this.sellingPrice = sellingPrice;
	}

	public int getTradingNum() {
		return tradingNum;
	}

	public void setTradingNum(int tradingNum) {
		this.tradingNum = tradingNum;
	}

	public int getTimes() {
		return times;
	}

	public void setTimes(int times) {
		this.times = times;
	}

	public int getProfit() {
		return profit;
	}

	public void setProfit(int profit) {
		this.profit = profit;
	}

}
