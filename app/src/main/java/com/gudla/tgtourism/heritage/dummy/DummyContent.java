package com.gudla.tgtourism.heritage.dummy;



import com.gudla.tgtourism.util.SourceArray;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Helper class for providing sample content for user interfaces created by
 * Android template wizards.
 * <p/>
 * TODO: Replace all uses of this class before publishing your app.
 */
public class DummyContent {

    /**
     * An array of sample (dummy) items.
     */
    public static final List<SourceArray> ITEMS = new ArrayList<>();

    /**
     * A map of sample (dummy) items, by ID.
     */
    public static final Map<String, DummyItem> ITEM_MAP = new HashMap<String, DummyItem>();


    static {
        // Add some sample items.
        for (int i = 0; i <= 40; i++) {
            addItem(createDummyItem(i));
        }
    }

    private static void addItem(SourceArray item) {

        ITEMS.add(item);
    }

    private static SourceArray createDummyItem(int position) {
        return new SourceArray(DummyItem.mImageId[position],DummyItem.mNames[position]);
    }

    /**
     * A dummy item representing a piece of content.
     */
    public static class DummyItem {
        public static int[] mImageId;
        public static String[] mNames;

        public DummyItem(int[] mImageId,String[] mName) {
            DummyItem.mImageId=mImageId;
            DummyItem.mNames=mName;
        }


    }
}
