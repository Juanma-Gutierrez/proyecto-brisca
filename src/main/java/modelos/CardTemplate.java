package modelos;

public class CardTemplate {
	Card card;
	boolean clickable;
	boolean reverse;
	int numCard;

	public CardTemplate(Card card, boolean clickable, boolean reverse, int numCard) {
		this.card = card;
		this.clickable = clickable;
		this.reverse = reverse;
		this.numCard = numCard;
	}

	@Override
	public String toString() {
		int _id = this.card.getId() + 1;
		String _clickable = "";
		String _clickableClose = "";
		if (this.clickable) {
			_clickable = String.format("<a href='partida.jsp?card=%s&inPlay=1&players=0' class='clickable'>",
					this.numCard);
			_clickableClose = "</a>";
		}
		if (this.reverse)
			_id = 99;
		return String.format("<div class='myContainer card centered'>%s<img src='assets/img/deck/%02d.png'>%s</div>",
				_clickable, _id, _clickableClose);

	}
}