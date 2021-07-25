# CollapsingToolbarBug
In the screen_recordings folder you can find original mp4 screen recordings.

Example 1: First swipe on the CollapsingToolbar to the top of the screen, and immediately after swipe down on the recycler.
Result: animation is broken
Expected result: animation smoothly scrolls up and then down.

<img src="https://github.com/maxim-pandra/CollapsingToolbarBug/blob/master/screen_recordings/animation1.gif" width="200" />

Example 2: First swipe on the CollapsingToolbar to the top of the screen, and immediately put finger on recycler and don't remove it until the animation ends.
Result: collapsing toolbar scrolls to the top and then jumps to the place it should be (position, when a finger touched the recycler)
Expected result: animation stops immediately after the finger is placed on the recycler.

<img src="https://github.com/maxim-pandra/CollapsingToolbarBug/blob/master/screen_recordings/animation2.gif" width="200" />

If all swipes occur on the same view (ether CollapsingToolBar, or recycler, everything is nice and smooth

<img src="https://github.com/maxim-pandra/CollapsingToolbarBug/blob/master/screen_recordings/animation3.gif" width="200" />

