package com.hedgehog.domain;

public class biz_rank {
    private Integer rankid;

    private Integer rankParenid;

    private String rankName;

    private String rankCode;

    private Integer rankOrder;

    private String rankDes;

    private String rankHonor;
    
    private String rankChannel;

    private Integer rankChannelcount;

    private String rankTemplet;

    private String rankCompany;
    
    private biz_prank prank;

    public Integer getRankid() {
        return rankid;
    }

    public void setRankid(Integer rankid) {
        this.rankid = rankid;
    }

    public Integer getRankParenid() {
        return rankParenid;
    }

    public void setRankParenid(Integer rankParenid) {
        this.rankParenid = rankParenid;
    }

    public String getRankName() {
        return rankName;
    }

    public void setRankName(String rankName) {
        this.rankName = rankName;
    }

    public String getRankCode() {
        return rankCode;
    }

    public void setRankCode(String rankCode) {
        this.rankCode = rankCode;
    }

    public Integer getRankOrder() {
        return rankOrder;
    }

    public void setRankOrder(Integer rankOrder) {
        this.rankOrder = rankOrder;
    }

    public String getRankDes() {
        return rankDes;
    }

    public void setRankDes(String rankDes) {
        this.rankDes = rankDes;
    }

    public String getRankHonor() {
        return rankHonor;
    }

    public void setRankHonor(String rankHonor) {
        this.rankHonor = rankHonor;
    }
    
    public String getRankChannel() {
        return rankChannel;
    }

    public void setRankChannel(String rankChannel) {
        this.rankChannel = rankChannel;
    }

    public Integer getRankChannelcount() {
        return rankChannelcount;
    }

    public void setRankChannelcount(Integer rankChannelcount) {
        this.rankChannelcount = rankChannelcount;
    }

    public String getRankTemplet() {
        return rankTemplet;
    }

    public void setRankTemplet(String rankTemplet) {
        this.rankTemplet = rankTemplet;
    }

    public String getRankCompany() {
        return rankCompany;
    }

    public void setRankCompany(String rankCompany) {
        this.rankCompany = rankCompany;
    }

    @Override
    public boolean equals(Object that) {
        if (this == that) {
            return true;
        }
        if (that == null) {
            return false;
        }
        if (getClass() != that.getClass()) {
            return false;
        }
        biz_rank other = (biz_rank) that;
        return (this.getRankid() == null ? other.getRankid() == null : this.getRankid().equals(other.getRankid()))
            && (this.getRankParenid() == null ? other.getRankParenid() == null : this.getRankParenid().equals(other.getRankParenid()))
            && (this.getRankName() == null ? other.getRankName() == null : this.getRankName().equals(other.getRankName()))
            && (this.getRankCode() == null ? other.getRankCode() == null : this.getRankCode().equals(other.getRankCode()))
            && (this.getRankOrder() == null ? other.getRankOrder() == null : this.getRankOrder().equals(other.getRankOrder()))
            && (this.getRankDes() == null ? other.getRankDes() == null : this.getRankDes().equals(other.getRankDes()))
            && (this.getRankHonor() == null ? other.getRankHonor() == null : this.getRankHonor().equals(other.getRankHonor()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getRankid() == null) ? 0 : getRankid().hashCode());
        result = prime * result + ((getRankParenid() == null) ? 0 : getRankParenid().hashCode());
        result = prime * result + ((getRankName() == null) ? 0 : getRankName().hashCode());
        result = prime * result + ((getRankCode() == null) ? 0 : getRankCode().hashCode());
        result = prime * result + ((getRankOrder() == null) ? 0 : getRankOrder().hashCode());
        result = prime * result + ((getRankDes() == null) ? 0 : getRankDes().hashCode());
        result = prime * result + ((getRankHonor() == null) ? 0 : getRankHonor().hashCode());
        return result;
    }

	public biz_prank getPrank() {
		return prank;
	}

	public void setPrank(biz_prank prank) {
		this.prank = prank;
	}
}