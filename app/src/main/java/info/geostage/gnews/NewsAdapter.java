package info.geostage.gnews;

/**
 * Created by Dimitar on 1.6.2017 г..
 */

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import java.util.List;

/**
 * An {@link NewsAdapter} knows how to create a list item layout for each earthquake
 * in the data source (a list of {@link News} objects).
 * <p>
 * These list item layouts will be provided to an adapter view like ListView
 * to be displayed to the user.
 */
public class NewsAdapter extends ArrayAdapter<News> {

    /**
     * Constructs a new {@link NewsAdapter}.
     *
     * @param context  of the app
     * @param articles is the list of articles, which is the data source of the adapter
     */
    public NewsAdapter(Context context, List<News> articles) {
        super(context, 0, articles);
    }

    /**
     * Returns a list view that displays information about the article at the given position
     * in the list of news.
     */
    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        // Check if an existing view is being reused, otherwise inflate the view
        View listItemView = convertView;
        if (listItemView == null) {
            listItemView = LayoutInflater.from(getContext()).inflate(
                    R.layout.list_item, parent, false);
        }

        // Get the {@link Article} object located at this position in the list
        News currentNews = getItem(position);

        // Find the TextView in the list_item.xml layout with the ID section.
        TextView titleTextView = (TextView) listItemView.findViewById(R.id.section);
        // Get the section from the currentNews object and set this text on the TextView.
        titleTextView.setText(currentNews.getSection());

        // Find the TextView in the list_item.xml layout with the ID title.
        TextView authorTextView = (TextView) listItemView.findViewById(R.id.title);
        // Get the title from the currentNews object and set this text on the TextView.
        authorTextView.setText(currentNews.getTitle());

        // Find the TextView in the list_item.xml layout with the ID publishedDate.
        TextView dateTextView = (TextView) listItemView.findViewById(R.id.publishedDate);
        // Get the published date from the currentNews object and set this text on the TextView.
        dateTextView.setText(currentNews.getDate());

        return listItemView;
    }

}
