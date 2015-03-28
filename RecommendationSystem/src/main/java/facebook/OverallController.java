package facebook;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.hibernate.annotations.common.util.impl.LoggerFactory;
import org.jboss.logging.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.social.facebook.api.Facebook;
import org.springframework.social.facebook.api.FeedOperations;
import org.springframework.social.facebook.api.LinkPost;
import org.springframework.social.facebook.api.PagedList;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;


@Controller
public class OverallController {
	private static final Logger logger = LoggerFactory.logger(OverallController.class);

	  private final SocialContext socialContext;

	  @Autowired
	  public OverallController(SocialContext socialContext) {
	    this.socialContext = socialContext;
	  }
	  
	  @RequestMapping("/login")
	  public String index(Model model) {
		  return "works";
	  }

	  @RequestMapping(value = "posts", method = RequestMethod.GET)
	  public String showPostsForUser(HttpServletRequest request, HttpServletResponse response, Model model) throws Exception {


	    if (socialContext.isSignedIn(request, response)) {

	      model.addAttribute("ceva", retrievePosts());
	    } else {
	    }

	    return "works";
	  }

	  private PagedList<LinkPost> retrievePosts() {

	    Facebook facebook = socialContext.getFacebook();
	    FeedOperations feedOps = facebook.feedOperations();

	    PagedList<LinkPost> posts = feedOps.getLinks();
	    logger.info("Retrieved " + posts.size() + " posts from the Facebook authenticated user");
	    return posts;
	  }

}