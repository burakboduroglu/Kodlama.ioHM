package Abstract;

import Entities.Campaign;
import Entities.Game;

public interface ISaleManager {
	void sellWithCampaign(Game game, Campaign campaign);

	void sellWithoutCampaign(Game game);

}
