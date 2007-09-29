//
// C++ Interface: mycardspixmaplabel
//
// Description: 
//
//
// Author: FThauer FHammer <f.thauer@web.de>, (C) 2007
//
// Copyright: See COPYING file that comes with this distribution
//
//
#ifndef MYCARDSPIXMAPLABEL_H
#define MYCARDSPIXMAPLABEL_H

#include <iostream>

#include <QtGui>
#include <QtCore>

#include "mainwindowimpl.h"

class MyCardsPixmapLabel : public QLabel
{
Q_OBJECT
public:
    MyCardsPixmapLabel(QFrame*);

    ~MyCardsPixmapLabel();

	void setMyW ( mainWindowImpl* theValue ) { myW = theValue; }

	void setIsFlipside(bool theValue){ isFlipside = theValue;}
	bool getIsFlipside() const{ return isFlipside;}
	
	void setFadeOutAction(bool theValue) { fadeOutAction = theValue; }
	bool getFadeOutAction() const { return fadeOutAction;}
	
	void startFadeOut(int);
	void startFlipCards(int, QPixmap, QPixmap*);
	void stopFlipCardsAnimation();
	
	void paintEvent(QPaintEvent * event);

	QPixmap *front;
	QPixmap *flipside;

signals:
	void signalFastFlipCards(bool);


public slots:
	
	void setPixmap ( const QPixmap &, const bool );
	void setFrontPixmap ( const QPixmap & );

	void nextFadeOutFrame();
	void nextFlipCardsFrame();
	
	void fastFlipCards(bool front);

// 	void mouseMoveEvent ( QMouseEvent *); 
	
	void mousePressEvent ( QMouseEvent *);
	void mouseReleaseEvent ( QMouseEvent *);

private: 

	mainWindowImpl* myW;	

	qreal frameOpacity;
	qreal opacityRaiseInterval;

	qreal flipCardsScaleIntervall;
	qreal frameFlipCardsAction1Size;
	qreal frameFlipCardsAction2Size;

	QTimer *fadeOutTimer;
	QTimer *flipCardsTimer;	

	bool isFlipside;
	bool fadeOutAction;
	bool flipCardsAction1;
	bool flipCardsAction2;
	bool stopFlipCards;
	
	bool mousePress;	
	bool fastFlipCardsFront;	

	QPixmap myHiddenFront;

friend class mainWindowImpl;
};

#endif
