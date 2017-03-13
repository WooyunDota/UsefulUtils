import android.content.*;
import java.util.*;
import android.os.*;
import java.io.*;

public class SafeIntent extends Intent
{
    public SafeIntent(final Intent intent) {
        super(intent);
    }
    
    public boolean[] getBooleanArrayExtra(final String s) {
        try {
            return super.getBooleanArrayExtra(s);
        }
        catch (Throwable t) {
            return null;
        }
    }
    
    public boolean getBooleanExtra(final String s, boolean booleanExtra) {
        try {
            booleanExtra = super.getBooleanExtra(s, booleanExtra);
            return booleanExtra;
        }
        catch (Throwable t) {
            return booleanExtra;
        }
    }
    
    public Bundle getBundleExtra(final String s) {
        try {
            return super.getBundleExtra(s);
        }
        catch (Throwable t) {
            return null;
        }
    }
    
    public byte[] getByteArrayExtra(final String s) {
        try {
            return super.getByteArrayExtra(s);
        }
        catch (Throwable t) {
            return null;
        }
    }
    
    public byte getByteExtra(final String s, byte byteExtra) {
        try {
            byteExtra = super.getByteExtra(s, byteExtra);
            return byteExtra;
        }
        catch (Throwable t) {
            return byteExtra;
        }
    }
    
    public char[] getCharArrayExtra(final String s) {
        try {
            return super.getCharArrayExtra(s);
        }
        catch (Throwable t) {
            return null;
        }
    }
    
    public char getCharExtra(final String s, char charExtra) {
        try {
            charExtra = super.getCharExtra(s, charExtra);
            return charExtra;
        }
        catch (Throwable t) {
            return charExtra;
        }
    }
    
    public CharSequence getCharSequenceExtra(final String s) {
        final CharSequence charSequence = null;
        try {
            return super.getCharSequenceExtra(s);
        }
        catch (Throwable t) {
            return charSequence;
        }
    }
    
    public double[] getDoubleArrayExtra(final String s) {
        try {
            return super.getDoubleArrayExtra(s);
        }
        catch (Throwable t) {
            return null;
        }
    }
    
    public double getDoubleExtra(final String s, double doubleExtra) {
        try {
            doubleExtra = super.getDoubleExtra(s, doubleExtra);
            return doubleExtra;
        }
        catch (Throwable t) {
            return doubleExtra;
        }
    }
    
    public float[] getFloatArrayExtra(final String s) {
        try {
            return super.getFloatArrayExtra(s);
        }
        catch (Throwable t) {
            return null;
        }
    }
    
    public float getFloatExtra(final String s, float floatExtra) {
        try {
            floatExtra = super.getFloatExtra(s, floatExtra);
            return floatExtra;
        }
        catch (Throwable t) {
            return floatExtra;
        }
    }
    
    public int[] getIntArrayExtra(final String s) {
        try {
            return super.getIntArrayExtra(s);
        }
        catch (Throwable t) {
            return null;
        }
    }
    
    public int getIntExtra(final String s, int intExtra) {
        try {
            intExtra = super.getIntExtra(s, intExtra);
            return intExtra;
        }
        catch (Throwable t) {
            return intExtra;
        }
    }
    
    public ArrayList<Integer> getIntegerArrayListExtra(final String s) {
        try {
            return (ArrayList<Integer>)super.getIntegerArrayListExtra(s);
        }
        catch (Throwable t) {
            return null;
        }
    }
    
    public long[] getLongArrayExtra(final String s) {
        try {
            return super.getLongArrayExtra(s);
        }
        catch (Throwable t) {
            return null;
        }
    }
    
    public long getLongExtra(final String s, long longExtra) {
        try {
            longExtra = super.getLongExtra(s, longExtra);
            return longExtra;
        }
        catch (Throwable t) {
            return longExtra;
        }
    }
    
    public Parcelable[] getParcelableArrayExtra(final String s) {
        try {
            return super.getParcelableArrayExtra(s);
        }
        catch (Throwable t) {
            return null;
        }
    }
    
    public <T extends Parcelable> ArrayList<T> getParcelableArrayListExtra(final String s) {
        try {
            return (ArrayList<T>)super.getParcelableArrayListExtra(s);
        }
        catch (Throwable t) {
            return null;
        }
    }
    
    public <T extends Parcelable> T getParcelableExtra(final String s) {
        try {
            final Parcelable parcelableExtra = super.getParcelableExtra(s);
            return (T)parcelableExtra;
        }
        catch (Throwable t) {
            final Parcelable parcelableExtra = null;
            return (T)parcelableExtra;
        }
    }
    
    public Serializable getSerializableExtra(final String s) {
        try {
            return super.getSerializableExtra(s);
        }
        catch (Throwable t) {
            return null;
        }
    }
    
    public short[] getShortArrayExtra(final String s) {
        try {
            return super.getShortArrayExtra(s);
        }
        catch (Throwable t) {
            return null;
        }
    }
    
    public short getShortExtra(final String s, short shortExtra) {
        try {
            shortExtra = super.getShortExtra(s, shortExtra);
            return shortExtra;
        }
        catch (Throwable t) {
            return shortExtra;
        }
    }
    
    public String[] getStringArrayExtra(final String s) {
        try {
            return super.getStringArrayExtra(s);
        }
        catch (Throwable t) {
            return null;
        }
    }
    
    public ArrayList<String> getStringArrayListExtra(final String s) {
        try {
            return (ArrayList<String>)super.getStringArrayListExtra(s);
        }
        catch (Throwable t) {
            return null;
        }
    }
    
    public String getStringExtra(String stringExtra) {
        final String s = null;
        try {
            stringExtra = super.getStringExtra(stringExtra);
            return stringExtra;
        }
        catch (Throwable t) {
            stringExtra = s;
            return stringExtra;
        }
    }
    
    public Intent putExtra(final String s, final byte b) {
        try {
            return super.putExtra(s, b);
        }
        catch (Throwable t) {
            return this;
        }
    }
    
    public Intent putExtra(final String s, final char c) {
        try {
            return super.putExtra(s, c);
        }
        catch (Throwable t) {
            return this;
        }
    }
    
    public Intent putExtra(final String s, final double n) {
        try {
            return super.putExtra(s, n);
        }
        catch (Throwable t) {
            return this;
        }
    }
    
    public Intent putExtra(final String s, final float n) {
        try {
            return super.putExtra(s, n);
        }
        catch (Throwable t) {
            return this;
        }
    }
    
    public Intent putExtra(final String s, final int n) {
        try {
            return super.putExtra(s, n);
        }
        catch (Throwable t) {
            return this;
        }
    }
    
    public Intent putExtra(final String s, final long n) {
        try {
            return super.putExtra(s, n);
        }
        catch (Throwable t) {
            return this;
        }
    }
    
    public Intent putExtra(final String s, final Bundle bundle) {
        try {
            return super.putExtra(s, bundle);
        }
        catch (Throwable t) {
            return this;
        }
    }
    
    public Intent putExtra(final String s, final Parcelable parcelable) {
        try {
            return super.putExtra(s, parcelable);
        }
        catch (Throwable t) {
            return this;
        }
    }
    
    public Intent putExtra(final String s, final Serializable s2) {
        try {
            return super.putExtra(s, s2);
        }
        catch (Throwable t) {
            return this;
        }
    }
    
    public Intent putExtra(final String s, final CharSequence charSequence) {
        try {
            return super.putExtra(s, charSequence);
        }
        catch (Throwable t) {
            return this;
        }
    }
    
    public Intent putExtra(final String s, final String s2) {
        try {
            return super.putExtra(s, s2);
        }
        catch (Throwable t) {
            return this;
        }
    }
    
    public Intent putExtra(final String s, final short n) {
        try {
            return super.putExtra(s, n);
        }
        catch (Throwable t) {
            return this;
        }
    }
    
    public Intent putExtra(final String s, final boolean b) {
        try {
            return super.putExtra(s, b);
        }
        catch (Throwable t) {
            return this;
        }
    }
    
    public Intent putExtra(final String s, final byte[] array) {
        try {
            return super.putExtra(s, array);
        }
        catch (Throwable t) {
            return this;
        }
    }
    
    public Intent putExtra(final String s, final char[] array) {
        try {
            return super.putExtra(s, array);
        }
        catch (Throwable t) {
            return this;
        }
    }
    
    public Intent putExtra(final String s, final double[] array) {
        try {
            return super.putExtra(s, array);
        }
        catch (Throwable t) {
            return this;
        }
    }
    
    public Intent putExtra(final String s, final float[] array) {
        try {
            return super.putExtra(s, array);
        }
        catch (Throwable t) {
            return this;
        }
    }
    
    public Intent putExtra(final String s, final int[] array) {
        try {
            return super.putExtra(s, array);
        }
        catch (Throwable t) {
            return this;
        }
    }
    
    public Intent putExtra(final String s, final long[] array) {
        try {
            return super.putExtra(s, array);
        }
        catch (Throwable t) {
            return this;
        }
    }
    
    public Intent putExtra(final String s, final Parcelable[] array) {
        try {
            return super.putExtra(s, array);
        }
        catch (Throwable t) {
            return this;
        }
    }
    
    public Intent putExtra(final String s, final String[] array) {
        try {
            return super.putExtra(s, array);
        }
        catch (Throwable t) {
            return this;
        }
    }
    
    public Intent putExtra(final String s, final short[] array) {
        try {
            return super.putExtra(s, array);
        }
        catch (Throwable t) {
            return this;
        }
    }
    
    public Intent putExtra(final String s, final boolean[] array) {
        try {
            return super.putExtra(s, array);
        }
        catch (Throwable t) {
            return this;
        }
    }
    
    public Intent putExtras(final Bundle bundle) {
        try {
            return super.putExtras(bundle);
        }
        catch (Throwable t) {
            return this;
        }
    }
    
    public Intent putIntegerArrayListExtra(final String s, final ArrayList<Integer> list) {
        try {
            return super.putIntegerArrayListExtra(s, (ArrayList)list);
        }
        catch (Throwable t) {
            return this;
        }
    }
    
    public Intent putParcelableArrayListExtra(final String s, final ArrayList<? extends Parcelable> list) {
        try {
            return super.putParcelableArrayListExtra(s, (ArrayList)list);
        }
        catch (Throwable t) {
            return this;
        }
    }
    
    public Intent putStringArrayListExtra(final String s, final ArrayList<String> list) {
        try {
            return super.putStringArrayListExtra(s, (ArrayList)list);
        }
        catch (Throwable t) {
            return this;
        }
    }
}
