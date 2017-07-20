package info.geostage.gnews;

/**
 * Created by Dimitar on 1.6.2017 г..
 */

/**
 * An {@link News} object contains information related to a single article.
 */
public class News {

    /**
     * Section of the article
     */
    private final String mSection;

    /**
     * Title the article
     */
    private final String mTitle;

    /**
     * Article published date
     */
    private final String mDate;

    /**
     * Website URL of the article
     */
    private final String mUrl;

    /**
     * Constructs a new {@link News} object.
     */
    public News(String section, String title, String date, String url) {
        mSection = section;
        mTitle = title;
        mDate = date;
        mUrl = url;
    }

    /**
     * Returns the section of the article.
     */
    public String getSection() {
        return mSection;
    }

    /**
     * Returns the title of the article.
     */
    public String getTitle() {
        return mTitle;
    }

    /**
     * Returns the published date of the article.
     */
    public String getDate() {
        return mDate;
    }

    /**
     * Returns the website URL to find the full text the article.
     */
    public String getUrl() {
        return mUrl;
    }

}
