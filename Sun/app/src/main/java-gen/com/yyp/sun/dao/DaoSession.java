package com.yyp.sun.dao;

import java.util.Map;

import org.greenrobot.greendao.AbstractDao;
import org.greenrobot.greendao.AbstractDaoSession;
import org.greenrobot.greendao.database.Database;
import org.greenrobot.greendao.identityscope.IdentityScopeType;
import org.greenrobot.greendao.internal.DaoConfig;

import com.yyp.sun.entity.MoodDiaryData;

import com.yyp.sun.dao.MoodDiaryDataDao;

// THIS CODE IS GENERATED BY greenDAO, DO NOT EDIT.

/**
 * {@inheritDoc}
 * 
 * @see org.greenrobot.greendao.AbstractDaoSession
 */
public class DaoSession extends AbstractDaoSession {

    private final DaoConfig moodDiaryDataDaoConfig;

    private final MoodDiaryDataDao moodDiaryDataDao;

    public DaoSession(Database db, IdentityScopeType type, Map<Class<? extends AbstractDao<?, ?>>, DaoConfig>
            daoConfigMap) {
        super(db);

        moodDiaryDataDaoConfig = daoConfigMap.get(MoodDiaryDataDao.class).clone();
        moodDiaryDataDaoConfig.initIdentityScope(type);

        moodDiaryDataDao = new MoodDiaryDataDao(moodDiaryDataDaoConfig, this);

        registerDao(MoodDiaryData.class, moodDiaryDataDao);
    }
    
    public void clear() {
        moodDiaryDataDaoConfig.clearIdentityScope();
    }

    public MoodDiaryDataDao getMoodDiaryDataDao() {
        return moodDiaryDataDao;
    }

}
