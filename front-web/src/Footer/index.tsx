import './styles.css'
import { ReactComponent as YoutubeIcon  } from './youtube.svg'
import { ReactComponent as InstagramIcon  } from './instagram.svg'
import { ReactComponent as LinkedlnIcon  } from './linkedin.svg'

export default function Footer(){
    return(
        <footer className="main-footer">
            <div className="footer-icons">
                <YoutubeIcon />
                <InstagramIcon />
                <LinkedlnIcon />
            </div>
        </footer>
    )
}