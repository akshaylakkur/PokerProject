public Class Deck { // deck class, this the thing in the poker table thing where all the cards are and you take stuff one by one and all that stuff
  
  List<Card> cards;
  int currentIndex;
  
  public Deck(){
    cards = new ArrayList<Card>();
  }

  public Card dealCard(){
    return cards.get(currentIndex);
  }

}
