package com.okisum.andoyz;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import android.app.Activity;
import android.graphics.Color;
import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import android.view.View;
import android.widget.ExpandableListView;
import android.widget.ExpandableListView.OnChildClickListener;
import android.widget.ExpandableListView.OnGroupClickListener;
import android.widget.ExpandableListView.OnGroupCollapseListener;
import android.widget.ExpandableListView.OnGroupExpandListener;
import android.widget.Toast;

public class ChordVarActivity extends Activity {

	ExpandableListAdapter listAdapter;
	ExpandableListView expListView;
	List<String> listDataHeader;
	HashMap<String, List<String>> listDataChild;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.chord_var);
		
		android.app.ActionBar ar = getActionBar();
		 ar.setBackgroundDrawable(new ColorDrawable(Color.parseColor("#cc93cc")));
		 
		 ar.setTitle("Chords Variation");

		// get the listview
		expListView = (ExpandableListView) findViewById(R.id.lvExp);

		// preparing list data
		prepareListData();

		listAdapter = new ExpandableListAdapter(this, listDataHeader, listDataChild);

		// setting list adapter
		expListView.setAdapter(listAdapter);

		// Listview Group click listener
		expListView.setOnGroupClickListener(new OnGroupClickListener() {

			@Override
			public boolean onGroupClick(ExpandableListView parent, View v,
					int groupPosition, long id) {
				// Toast.makeText(getApplicationContext(),
				// "Group Clicked " + listDataHeader.get(groupPosition),
				// Toast.LENGTH_SHORT).show();
				return false;
			}
		});

		// Listview Group expanded listener
		expListView.setOnGroupExpandListener(new OnGroupExpandListener() {

			@Override
			public void onGroupExpand(int groupPosition) {
				Toast.makeText(getApplicationContext(),
						listDataHeader.get(groupPosition) + " Expanded",
						Toast.LENGTH_SHORT).show();
			}
		});

		// Listview Group collasped listener
		expListView.setOnGroupCollapseListener(new OnGroupCollapseListener() {

			@Override
			public void onGroupCollapse(int groupPosition) {
				Toast.makeText(getApplicationContext(),
						listDataHeader.get(groupPosition) + " Collapsed",
						Toast.LENGTH_SHORT).show();

			}
		});

		// Listview on child click listener
		expListView.setOnChildClickListener(new OnChildClickListener() {

			@Override
			public boolean onChildClick(ExpandableListView parent, View v,
					int groupPosition, int childPosition, long id) {
				// TODO Auto-generated method stub
				/*Toast.makeText(
						getApplicationContext(),
						listDataHeader.get(groupPosition)
								+ " : "
								+ listDataChild.get(
										listDataHeader.get(groupPosition)).get(
										childPosition), Toast.LENGTH_SHORT)
						.show();
						*/
				return false;
			}
		});
	}

	/*
	 * Preparing the list data
	 */
	private void prepareListData() {
		listDataHeader = new ArrayList<String>();
		listDataChild = new HashMap<String, List<String>>();

		// Adding child data
		listDataHeader.add("A");
		listDataHeader.add("B");
		listDataHeader.add("C");
		listDataHeader.add("D");
		listDataHeader.add("E");
		listDataHeader.add("F");
		listDataHeader.add("G");

		// Adding child data
		List<String> A = new ArrayList<String>();
		A.add("A");
		A.add("A#");
		A.add("A#4");
		A.add("A#7");
		A.add("A#dim");
		A.add("A#m");
		A.add("A#m7");
		A.add("A#maj");
		A.add("A+");
		A.add("A/D");
		A.add("A/F#");
		A.add("A/G#");
		A.add("A11");
		A.add("A13");
		A.add("A4");
		A.add("A6");
		A.add("A7");
		A.add("A79+");
		A.add("A7+");
		A.add("A7sus4");
		A.add("A9");
		A.add("Ab");
		A.add("Ab+");
		A.add("Ab11");
		A.add("Ab4");
		A.add("Ab7");
		A.add("Abdim");
		A.add("Abm");
		A.add("Abm7");
		A.add("Abmaj7");
		A.add("Adim");
		A.add("Am");
		A.add("Am7#");
		A.add("Amadd9");
		A.add("Am/G");
		A.add("Am6");
		A.add("Am7");
		A.add("Am7sus4");
		A.add("Am9");
		A.add("Amaj7");
		A.add("Asus");
		

		List<String> B = new ArrayList<String>();
		B.add("B");
		B.add("BaddE");
		B.add("B+");
		B.add("B/F#");
		B.add("B11");
		B.add("B11/13");
		B.add("B13");
		B.add("B4");
		B.add("B7");
		B.add("B7#9");
		B.add("B7+");
		B.add("B9");
		B.add("BaddE/F#");
		B.add("B+");
		B.add("B11");
		B.add("Bb6");
		B.add("Bb9");
		B.add("Bbm9");
		B.add("Bm");
		B.add("Bmmaj7");
		B.add("Bm6");
		B.add("Bm7");
		B.add("Bm7b5");
		B.add("Bmaj");
		B.add("Bmsus9");

		List<String> C = new ArrayList<String>();
		C.add("C");
		C.add("C#");
		C.add("C#add");
		C.add("C#4");
		C.add("C#7");
		C.add("C#m");
		C.add("C#m7");
		C.add("C#maj");
		C.add("Cadd9");
		C.add("C/B");
		C.add("C11");
		C.add("C4");
		C.add("C7");
		C.add("C9");
		C.add("C911");
		C.add("Cadd2/B");
		C.add("Cm");
		C.add("Cm11");
		C.add("Cm7");
		C.add("Cmaj");
		C.add("Cmaj7");
		C.add("Csus2");
		C.add("Csus9");
		
		List<String> D = new ArrayList<String>();
		D.add("D");
		D.add("D#");
		D.add("D#4");
		D.add("D#7");
		D.add("D#m");
		D.add("D#m7");
		D.add("D#maj7");
		D.add("Dadd9");
		D.add("D/A");
		D.add("D/B");
		D.add("D/C");
		D.add("D/C#");
		D.add("D/E");
		D.add("D/G");
		D.add("D11");
		D.add("D4");
		D.add("D5/E");
		D.add("D6");
		D.add("D7");
		D.add("D7#9");
		D.add("D7sus2");
		D.add("D7sus4");
		D.add("D9");
		D.add("D9add6");
		D.add("Dm");
		D.add("Dm#7");
		D.add("Dm/A");
		D.add("Dm/B");
		D.add("Dm/C");
		D.add("Dm/C#");
		D.add("Dm7");
		D.add("Dm9");
		D.add("Dmaj7");
		D.add("Dsus2");
		
		List<String> E = new ArrayList<String>();
		E.add("E");
		E.add("E11");
		E.add("E5");
		E.add("E6");
		E.add("E7");
		E.add("E7#9");
		E.add("E75b");
		E.add("E7b9");
		E.add("E9");
		E.add("Ebadd9");
		E.add("Em");
		E.add("Emadd9");
		E.add("Emsus4");
		E.add("Em/B");
		E.add("Em/D");
		E.add("Em6");
		E.add("Em7");
		E.add("Emaj7");
		E.add("Esus");
		E.add("Esus4");
		
		List<String> F = new ArrayList<String>();
		F.add("F");
		F.add("F#");
		F.add("F#+");
		F.add("F#/E");
		F.add("F#11");
		F.add("F#4");
		F.add("F#7");
		F.add("F#9");
		F.add("F#m");
		F.add("F#m6");
		F.add("F#m7-5");
		F.add("F#maj");
		F.add("F#maj7");
		F.add("Fadd9");
		F.add("F/A");
		F.add("F/C");
		F.add("F/G");
		F.add("F11");
		F.add("F3");
		F.add("F6");
		F.add("F7");
		F.add("F7/A");
		F.add("F9");
		F.add("FaddG");
		F.add("Fm");
		F.add("Fm6");
		F.add("Fm7");
		F.add("Fmaj7");
		F.add("Fmaj7+5");
		F.add("Fmaj7/A");
		F.add("Fmmaj7");
		
		List<String> G = new ArrayList<String>();
		G.add("G");
		G.add("G#m6");
		G.add("Gadd9");
		G.add("G/A");
		G.add("G/B");
		G.add("G/D");
		G.add("G/F#");
		G.add("G11");
		G.add("G4");
		G.add("G6");
		G.add("G6sus4");
		G.add("G7");
		G.add("G7#9");
		G.add("G7sus4");
		G.add("G9");
		G.add("G911");
		G.add("Gm");
		G.add("Gm/Bb");
		G.add("Gm6");
		G.add("Gm7");
		G.add("Gmaj7");
		G.add("Gmaj7sus4");
		G.add("Gmaj9");
		G.add("Gsus4");

		listDataChild.put(listDataHeader.get(0), A); // Header, Child data
		listDataChild.put(listDataHeader.get(1), B);
		listDataChild.put(listDataHeader.get(2), C);
		listDataChild.put(listDataHeader.get(3), D); 
		listDataChild.put(listDataHeader.get(4), E);
		listDataChild.put(listDataHeader.get(5), F);
		listDataChild.put(listDataHeader.get(6), G);
	}
}

