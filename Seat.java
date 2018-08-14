
public class Seat {
	private String material;
	private String filler;
	private String brand;
	private boolean suitableSeason;
	private boolean isInfantSafe;
	private boolean isHeated;
	private int adjustHeight;
	
	
	public String getMaterial() {
		return material;
	}
	public void setMaterial(String material) {
		this.material = material;
	}
	public String getFiller() {
		return filler;
	}
	public void setFiller(String filler) {
		this.filler = filler;
	}
	public String getBrand() {
		return brand;
	}
	public void setBrand(String brandl) {
		this.brand = brand;
	}
	public boolean isSuitableSeason() {
		return suitableSeason;
	}
	public void setSuitableSeason(boolean suitableSeason) {
		this.suitableSeason = suitableSeason;
	}
	public boolean isInfantSafe() {
		return isInfantSafe;
	}
	public void setInfantSafe(boolean isInfantSafe) {
		this.isInfantSafe = isInfantSafe;
	}
	public boolean isHeated() {
		return isHeated;
	}
	public void setHeated(boolean isHeated) {
		this.isHeated = isHeated;
	}
	public int getAdjustHeight() {
		return adjustHeight;
	}
	public void setAdjustHeight(int adjustHeight) {
		this.adjustHeight = adjustHeight;
	}
	

	
	public Seat(String material, String filler, boolean suitableSeason, boolean isInfantSafe, boolean isHeated,
			int adjustHeight) {
		this.material = material;
		this.filler = filler;
		this.suitableSeason = suitableSeason;
		this.isInfantSafe = isInfantSafe;
		this.isHeated = isHeated;
		this.adjustHeight = adjustHeight;
	}
	
	public Seat(String material, String filler, String brand, boolean suitableSeason, boolean isInfantSafe,
			boolean isHeated, int adjustHeight) {
		super();
		this.material = material;
		this.filler = filler;
		this.brand = brand;
		this.suitableSeason = suitableSeason;
		this.isInfantSafe = isInfantSafe;
		this.isHeated = isHeated;
		this.adjustHeight = adjustHeight;
	}
	public void pullForward() {
		
	}
	public void pushBack() {
		
	}
}
