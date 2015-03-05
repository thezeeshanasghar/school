/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.school.util;

import com.school.domain.core.Model;
import org.eclipse.persistence.descriptors.ClassDescriptor;
import org.eclipse.persistence.internal.sessions.AbstractRecord;
import org.eclipse.persistence.internal.sessions.AbstractSession;
import org.eclipse.persistence.queries.DatabaseQuery;
import org.eclipse.persistence.queries.DeleteObjectQuery;
import org.eclipse.persistence.queries.QueryRedirector;
import org.eclipse.persistence.queries.UpdateObjectQuery;
import org.eclipse.persistence.sessions.Record;
import org.eclipse.persistence.sessions.Session;

/**
 *
 * @author asghar.zeeshan
 */
public class CustomDeleteRedirector implements QueryRedirector
{
 
    @Override
    public Object invokeQuery(DatabaseQuery query, Record arguments, Session session)
    {
        ClassDescriptor descriptor = session.getDescriptor(query.getReferenceClass());
        
        DeleteObjectQuery deleteObjectQuery = (DeleteObjectQuery) query;
        
        Model emp =  (Model) deleteObjectQuery.getObject();
        emp.setStatus("deleted");
        
        UpdateObjectQuery updateObjectQuery = new UpdateObjectQuery(emp);
        descriptor.addDirectQueryKey("status", "STATUS");
        updateObjectQuery.setDescriptor(descriptor);
        deleteObjectQuery.setDescriptor(updateObjectQuery.getDescriptor());
        return updateObjectQuery.execute((AbstractSession) session, (AbstractRecord) arguments);        
    }
 
}