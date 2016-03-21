/**
 * Copyright (c) 2014-2015 openHAB UG (haftungsbeschraenkt) and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.eclipse.smarthome.binding.homie.handler;

import static org.eclipse.smarthome.binding.homie.HomieBindingConstants.CHANNEL_PING;

import org.eclipse.smarthome.core.thing.ChannelUID;
import org.eclipse.smarthome.core.thing.Thing;
import org.eclipse.smarthome.core.thing.ThingStatus;
import org.eclipse.smarthome.core.thing.binding.BaseThingHandler;
import org.eclipse.smarthome.core.types.Command;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * The {@link HomieHandler} is responsible for handling commands, which are
 * sent to one of the channels.
 *
 * @author Roman - Initial contribution
 */
public class HomieHandler extends BaseThingHandler {

    private Logger logger = LoggerFactory.getLogger(HomieHandler.class);

    public HomieHandler(Thing thing) {
        super(thing);
        logger.info("HomieHandler::constructor()");
    }

    @Override
    public void handleCommand(ChannelUID channelUID, Command command) {
        logger.info("HomieHandler::handleCommnad()");

        logger.info(getThing().getConfiguration().get("").toString());

        if (channelUID.getId().equals(CHANNEL_PING)) {
            // TODO: handle command

            // Note: if communication with thing fails for some reason,
            // indicate that by setting the status with detail information
            // updateStatus(ThingStatus.OFFLINE, ThingStatusDetail.COMMUNICATION_ERROR,
            // "Could not control device at IP address x.x.x.x");
        }
    }

    @Override
    public void initialize() {
        // TODO: Initialize the thing. If done set status to ONLINE to indicate proper working.
        // Long running initialization should be done asynchronously in background.
        updateStatus(ThingStatus.ONLINE);

        // Note: When initialization can NOT be done set the status with more details for further
        // analysis. See also class ThingStatusDetail for all available status details.
        // Add a description to give user information to understand why thing does not work
        // as expected. E.g.
        // updateStatus(ThingStatus.OFFLINE, ThingStatusDetail.CONFIGURATION_ERROR,
        // "Can not access device as username and/or password are invalid");
    }

    @Override
    public void dispose() {
        // TODO: dispose
    }
}