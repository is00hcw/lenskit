/*
 * LensKit, an open source recommender systems toolkit.
 * Copyright 2010-2012 Regents of the University of Minnesota and contributors
 *
 * This program is free software; you can redistribute it and/or modify
 * it under the terms of the GNU Lesser General Public License as
 * published by the Free Software Foundation; either version 2.1 of the
 * License, or (at your option) any later version.
 *
 * This program is distributed in the hope that it will be useful, but WITHOUT
 * ANY WARRANTY; without even the implied warranty of MERCHANTABILITY or FITNESS
 * FOR A PARTICULAR PURPOSE. See the GNU General Public License for more
 * details.
 *
 * You should have received a copy of the GNU General Public License along with
 * this program; if not, write to the Free Software Foundation, Inc., 51
 * Franklin Street, Fifth Floor, Boston, MA 02110-1301, USA.
 */
package org.grouplens.lenskit.eval.config;

import java.lang.annotation.*;

/**
 * Specify a delegate class to be used to configure builders of the type to which
 * this annotation is applied. When using a builder to instantiate a setter or adder
 * parameter, if the builder class has this annotation the specified class is used
 * as the delegate instead of the default {@link BuilderDelegate} when invoking the
 * builder closure.
 * <p/>
 * If the delegate class has a constructor taking the builder as a single argument,
 * that constructor is used; otherwise a no-arg constructor is used. The builder
 * constructor is highly recommended, as otherwise there isn't a good way to make
 * the builder available to the delegate.
 *
 * @author Michael Ekstrand
 * @since 0.10
 */
@Documented
@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.TYPE)
public @interface ConfigDelegate {
    /**
     * The delegate implementation to use. The class must have a no-arg public
     * constructor.
     * @return The delegate class.
     */
    Class<?> value();
}
