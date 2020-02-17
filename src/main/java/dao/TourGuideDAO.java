package dao;

import domain.TourGuide;

public class TourGuideDAO extends DAO<TourGuide> {

    @Override
    protected String getSqlString() {
        return "select tg from TourGuide tg";
    }

    @Override
    protected Class getClassName() {
        return TourGuide.class;
    }
}
