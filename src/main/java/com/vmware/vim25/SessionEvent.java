package com.vmware.vim25;

import com.vmware.vim25.AlreadyAuthenticatedSessionEvent;
import com.vmware.vim25.BadUsernameSessionEvent;
import com.vmware.vim25.Event;
import com.vmware.vim25.GlobalMessageChangedEvent;
import com.vmware.vim25.NoAccessUserEvent;
import com.vmware.vim25.ServerStartedSessionEvent;
import com.vmware.vim25.SessionTerminatedEvent;
import com.vmware.vim25.UserLoginSessionEvent;
import com.vmware.vim25.UserLogoutSessionEvent;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SessionEvent")
@XmlSeeAlso({BadUsernameSessionEvent.class, UserLogoutSessionEvent.class, GlobalMessageChangedEvent.class, ServerStartedSessionEvent.class, SessionTerminatedEvent.class, AlreadyAuthenticatedSessionEvent.class, NoAccessUserEvent.class, UserLoginSessionEvent.class})
public class SessionEvent extends Event {}
