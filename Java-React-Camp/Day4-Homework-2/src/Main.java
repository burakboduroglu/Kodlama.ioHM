import java.time.LocalDate;

import Abstract.IGamerCheckService;
import Concrete.CampaignManager;
import Concrete.GameManager;
import Concrete.GamerCheckService;
import Concrete.GamerManager;
import Concrete.SaleManager;
import Entities.Game;
import Entities.Gamer;
import Entities.Campaign;

public class Main {

	public static void main(String[] args) {
		Game game = new Game(1, "GTA 5", 149);
		Gamer gamer = new Gamer(1, "Burak","Boduroðlu","Kimlik-No",LocalDate.of(2001, 1, 13));
		Campaign campaign = new Campaign(1, "Bahar Kampanyasý", 29);
		
		GamerManager gamerManager = new GamerManager(new GamerCheckService());
		gamerManager.add(gamer);
		
		CampaignManager campaignManager = new CampaignManager();
		campaignManager.add(campaign);
		
		GameManager gameManager = new GameManager();
		gameManager.add(game);
		
		SaleManager saleManager = new SaleManager();
		saleManager.sellWithCampaign(game, campaign);
		saleManager.sellWithoutCampaign(game);
		
		

	}

}
