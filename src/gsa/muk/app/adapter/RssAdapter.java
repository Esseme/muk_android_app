package gsa.muk.app.adapter;

import gsa.muk.app.R;
import gsa.muk.app.RssItem;

import java.util.List;

import android.content.Context;
import android.text.Html;
import android.text.Spanned;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

public class RssAdapter extends BaseAdapter{
		 
	    private final List<RssItem> items;
	    private final Context context;
	 
	    public RssAdapter(Context context, List<RssItem> items) {
	        this.items = items;
	        this.context = context;
	    }
	 
	    @Override
	    public int getCount() {
	        return items.size();
	    }
	 
	    @Override
	    public Object getItem(int position) {
	        return items.get(position);
	    }
	 
	    @Override
	    public long getItemId(int id) {
	        return id;
	    }
	 
	    @Override
	    public View getView(int position, View convertView, ViewGroup parent) {
	        ViewHolder holder;
	        if (convertView == null) {
	            convertView = View.inflate(context, R.layout.rss_item, null);
	            holder = new ViewHolder();
	            holder.itemTitle = (TextView) convertView.findViewById(R.id.itemTitle);
	            holder.itemDescription = (TextView) convertView.findViewById(R.id.itemDescription);
	            convertView.setTag(holder);
	        } else {
	            holder = (ViewHolder) convertView.getTag();
	        }
	        holder.itemTitle.setText(items.get(position).getTitle());
	        Spanned x = Html.fromHtml(items.get(position).getDescription());
	        holder.itemDescription.setText(x);
	        return convertView;
	    }
	 
	    static class ViewHolder {
	        TextView itemTitle;
	        TextView itemDescription;
	    }
	}

