package Concrete;

import Abstract.ISaleManager;
import Entities.Campaign;
import Entities.Game;

public class SaleManager implements ISaleManager {

	@Override
	public void sellWithCampaign(Game game, Campaign campaign) {
		System.out.println
		("Kampanyalý : " + game.getName() + " oyunu " + game.getPrice() + " fiyatýna " + 
		campaign.getDiscountAmount() + "TL indirim ile satýldý." + " Geçerli Kampanya Adý : " 
		+ campaign.getName());
	}

	@Override
	public void sellWithoutCampaign(Game game) {
		System.out.println("Kampanyasýz : " + game.getName() + " oyunu " + game.getPrice() + " fiyatýna satýldý.");
		
	}

	

}
