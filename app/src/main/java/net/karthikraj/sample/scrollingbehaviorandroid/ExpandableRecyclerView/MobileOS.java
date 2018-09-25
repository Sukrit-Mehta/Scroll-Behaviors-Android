package net.karthikraj.sample.scrollingbehaviorandroid.ExpandableRecyclerView;

import com.thoughtbot.expandablerecyclerview.models.ExpandableGroup;

import java.util.List;

/**
 * Created by sukrit on 25/9/18.
 */

public class MobileOS extends ExpandableGroup<Phone> {

    public MobileOS(String title, List<Phone> items) {
        super(title, items);
    }
}