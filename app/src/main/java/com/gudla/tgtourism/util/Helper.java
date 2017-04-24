package com.gudla.tgtourism.util;


import java.util.ArrayList;
import java.util.List;

/**
 * Helper class for providing sample content for user interfaces created by
 * Android template wizards.
 * <p/>
 * TODO: Replace all uses of this class before publishing your app.
 */
public class Helper {

    /**
     * An array of sample (dummy) items.
     */
    private static final List<SourceArray> ITEMS = new ArrayList<>();


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
    private static class DummyItem {
        private static int[] mImageId;
        private static String[] mNames;

        public DummyItem(int[] mImageId,String[] mName) {
            DummyItem.mImageId=mImageId;
            DummyItem.mNames=mName;
        }


    }
}
